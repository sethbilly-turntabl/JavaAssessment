package com.vmorg;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.vmorg.auth.AuthorisingService;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
public class AuthorisingServiceTest {


    @Test
    public void testUserHasEntitlementToRequestBuild() {
        AuthorisingService authorisingService = mock(AuthorisingService.class);

        /**
         * Should return a true if any user is supplied
         */
        when(authorisingService.isAuthorised(anyString())).thenReturn(true);


    }

    @Test
    public void testAuthorisingServiceWillFailForWrongUser() {
        AuthorisingService authorisingService = mock(AuthorisingService.class);
        given(authorisingService.isAuthorised("RightUser")).willReturn(true);

        //verify(authorisingService, false).isAuthorised("WrongUser");
    }
}
