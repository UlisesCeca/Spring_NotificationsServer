package com.ulises.notificationsserver.constants;

public class Constants {
    public static final String REQUEST_ERROR_INTERNAL_SERVER_ERROR = "There has been a server error and your request " +
            "couldn't be processed.";
    public static final String REQUEST_ERROR_NOT_FOUND = "The requested resourced wasn't found.";
    public static final String EMAIL_HOST = "ssl0.ovh.net";
    public static final String EMAIL_USERNAME = "pruebas@ulisesceca.com";
    public static final String EMAIL_PASSWORD = "111111111";
    public static final int EMAIL_PORT = 587;
    public static final String ENDPOINT_NOTIFICATIONS = "/notifications";
    public static final String ENDPOINT_NOTIFICATIONS_EMAIL = "/email";
    public static final String REQUEST_ERROR_NULL_BODY = "Request's body must not be null.";
}
