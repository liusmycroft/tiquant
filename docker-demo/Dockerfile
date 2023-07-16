FROM python:3.7
WORKDIR ./strategy
COPY . .
RUN pip install -r requirements.txt -i https://pypi.tuna.tsinghua.edu.cn/simple
CMD ["python", "./src/main.py"]
