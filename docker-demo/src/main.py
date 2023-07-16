#import numpy as np
import os
if __name__ == '__main__':
    # 在logs目录下创建个名为docker.log的空文件，验证容器和宿主机是否能进行数据同步
    print(os.path.dirname(__file__))
    os.chdir(os.path.dirname(__file__))
    os.mknod('../logs/container.log')
    print("hello docker")
