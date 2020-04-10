package com.feeder.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class GenericData {

  public enum Type {
    DEMO,
    REDDIT,
    GITHUB,
    HACKERNEWS,
    TWITTER,
    WEATHER,
  }

  @JsonProperty("feedType")
  public abstract Type feedType();
}
