package org.zalando.logbook;

public interface Correlation {

    String getId();

    HttpRequest getRequest();

    HttpResponse getResponse();

}
