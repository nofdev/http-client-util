package org.nofdev.http;

import java.util.Map;

/**
 * Created by Qiang on 11/5/15.
 */
public class HttpMessageWithHeader extends HttpMessageSimple {


    private Map<String,String> headers;

    public HttpMessageWithHeader() {
    }

    public HttpMessageWithHeader(int statusCode, String contentType, String body, Map<String,String> headers) {
        super(statusCode,contentType,body);
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }


}
