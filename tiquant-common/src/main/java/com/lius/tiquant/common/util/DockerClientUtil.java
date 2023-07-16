package com.lius.tiquant.common.util;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientImpl;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import java.time.Duration;

public class DockerClientUtil {

  public static void main(String[] args) {
    DockerClient dockerClient = DockerClientUtil.connectDocker("tcp://localhost:2375");
    Info exec = dockerClient.infoCmd()
      .exec();
    System.out.println(JsonObject.mapFrom(exec).toString());
  }

  public static DockerClient connectDocker(String address) {
    DefaultDockerClientConfig config = DefaultDockerClientConfig
      .createDefaultConfigBuilder()
      .withDockerHost(address)
      .build();

    // 创建DockerHttpClient
    DockerHttpClient httpClient = new ApacheDockerHttpClient
      .Builder()
      .dockerHost(config.getDockerHost())
      .maxConnections(100)
      .connectionTimeout(Duration.ofSeconds(30))
      .responseTimeout(Duration.ofSeconds(45))
      .build();
    return DockerClientImpl.getInstance(config, httpClient);
  }

  public static CreateContainerResponse createContainer(DockerClient client, String containerName, String imageName) {
    return client.createContainerCmd(imageName)
      .withName(containerName)
      .exec();
  }

  public static void startContainer(DockerClient client, String containerId) {
    client.startContainerCmd(containerId).exec();
  }

  public static void stopContainer(DockerClient client, String containerId) {
    client.stopContainerCmd(containerId).exec();
  }

  public static void removeContainer(DockerClient client, String containerId) {
    client.removeContainerCmd(containerId).exec();
  }

}
