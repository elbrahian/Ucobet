FROM ubuntu:latest
LABEL authors="brahi"

ENTRYPOINT ["top", "-b"]