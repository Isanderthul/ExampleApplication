
package com.example.application.rest;

import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Post;
import com.googlecode.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.StringHttpMessageConverter;

@Rest(rootUrl = "http://pubsub.pubnub.com", converters = StringHttpMessageConverter.class)
public interface RestClient {


    @Get("/")
    public abstract void main();

    @Get("/publish/{pubkey}/{subkey}/{signature}/{channel}/{callback}/{message}")
    void sendMessage(String pubkey, String subkey, String signature, String channel, String callback, String message);
    
}
