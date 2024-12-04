package org.woven.springdemo.config;

import org.springframework.http.server.reactive.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.function.*;

@Component
public class RouterValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/auth/register",
            "/auth/login"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

}
