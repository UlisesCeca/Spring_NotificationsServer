package com.ulises.notificationsserver.rest.exceptionsmappers;

import com.ulises.notificationsserver.rest.dto.ErrorDTO;
import com.ulises.notificationsserver.rest.dto.ErrorDTOBuilder;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import static com.ulises.notificationsserver.constants.Constants.REQUEST_ERROR_NOT_FOUND;

public class NotFoundMapper implements ExceptionMapper<NotFoundException> {
    @Override
    public Response toResponse(NotFoundException e) {
        final ErrorDTO errorDTO = ErrorDTOBuilder.builder()
                .message(REQUEST_ERROR_NOT_FOUND)
                .build();
        return Response.status(Response.Status.NOT_FOUND)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .entity(errorDTO)
                .build();
    }
}