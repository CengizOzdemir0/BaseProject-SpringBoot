package com.cengiz.baseproject.base.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * yyyy-MM-dd formatında gelen json veriyi instant a çevirir.Not: time bilgisi 00:00:00 ele alınır.
 *
 * @author Mehmet ONAR
 * @date 2024-03-07
 */
public class CustomLocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

  @Override
  public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
    String timestampString = jsonParser.readValueAs(String.class);
    long timestamp = Long.parseLong(timestampString);
    return LocalDateTime.ofEpochSecond(timestamp / 1000000, 0, ZoneOffset.UTC);
  }
}