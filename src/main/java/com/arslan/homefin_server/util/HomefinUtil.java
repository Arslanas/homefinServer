package com.arslan.homefin_server.util;

import com.arslan.homefin_server.security.UserPrincipal;
import com.arslan.homefin_server.security.exception.AppException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;

public class HomefinUtil {

    public static long getUserId() {
        Object securityObject = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (securityObject instanceof UserPrincipal){
            UserPrincipal principal = (UserPrincipal) securityObject;
            return principal.getId();
        }
        throw new AccessDeniedException("User is not authenticated");
    }
}
