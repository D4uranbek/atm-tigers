package uz.jl.enums.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Elmurodov Javohir, Mon 12:28 PM. 11/29/2021
 */


@Getter
@AllArgsConstructor
public enum HttpStatus {
    HTTP_401(401, "UnAuthorized"),
    HTTP_403(403, "Forbidden"),
    HTTP_404(404, "Not Found"),
    HTTP_405(405, "Method not allowed");
    private int code;
    private String description;
}
