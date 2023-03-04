FROM openjdk:17-buster

ENV TZ Asia/Tokyo
ENV KOTLIN_VERSION 1.7.21
ENV APP_ROOT /app

RUN apt-get update -qq && \
    apt-get install --no-install-recommends -y git zip unzip && \
    apt-get clean && \
    rm -rf /var/cache/apt

# install kotlin
RUN curl -s https://get.sdkman.io | bash && \
    bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install kotlin $KOTLIN_VERSION"

WORKDIR $APP_ROOT
