package io.kubernetes.client.extended.network.exception;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class NoAvailableAddressExceptionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testNoAvailableAddressExceptionCreation}, hash: 4BBE080CC7579A4AF479E97C865E6753
    @Test
    void testNoAvailableAddressExceptionCreation() {
        NoAvailableAddressException exception = new NoAvailableAddressException();
        assertNotNull(exception);
    }
}
