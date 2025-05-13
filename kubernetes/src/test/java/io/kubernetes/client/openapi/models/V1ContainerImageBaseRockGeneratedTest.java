package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ContainerImageBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: CD6FBB0A4EB48AF9CF5C3B0D794D6CBA
    @Test
    void testConstructor() {
        V1ContainerImage containerImage = new V1ContainerImage();
        assertNotNull(containerImage);
    }

    //BaseRock generated method id: ${testSetAndGetNames}, hash: 0EDE849B53061D10B35ED1226D17E93E
    @Test
    void testSetAndGetNames() {
        V1ContainerImage containerImage = new V1ContainerImage();
        List<String> names = new ArrayList<>();
        names.add("image1");
        names.add("image2");
        containerImage.setNames(names);
        assertEquals(names, containerImage.getNames());
    }

    //BaseRock generated method id: ${testAddNamesItem}, hash: E2F8CF3F34211EC4099998F86EE19CFC
    @Test
    void testAddNamesItem() {
        V1ContainerImage containerImage = new V1ContainerImage();
        String imageName = "newImage";
        containerImage.addNamesItem(imageName);
        assertTrue(containerImage.getNames().contains(imageName));
    }

    //BaseRock generated method id: ${testSetAndGetSizeBytes}, hash: 5D58F47221F52BA6AA498E00094BBC52
    @Test
    void testSetAndGetSizeBytes() {
        V1ContainerImage containerImage = new V1ContainerImage();
        Long sizeBytes = 1024L;
        containerImage.setSizeBytes(sizeBytes);
        assertEquals(sizeBytes, containerImage.getSizeBytes());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 26A7BBBC4703DE982C292F2C3E22AD67
    @Test
    void testEqualsAndHashCode() {
        V1ContainerImage image1 = new V1ContainerImage().names(List.of("image1", "image2")).sizeBytes(1024L);
        V1ContainerImage image2 = new V1ContainerImage().names(List.of("image1", "image2")).sizeBytes(1024L);
        V1ContainerImage image3 = new V1ContainerImage().names(List.of("image3")).sizeBytes(2048L);
        assertEquals(image1, image2);
        assertNotEquals(image1, image3);
        assertEquals(image1.hashCode(), image2.hashCode());
        assertNotEquals(image1.hashCode(), image3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 40EC83EA723560146D709FE57ABA3453
    @Test
    void testToString() {
        V1ContainerImage containerImage = new V1ContainerImage().names(List.of("image1", "image2")).sizeBytes(1024L);
        String expected = "class V1ContainerImage {\n    names: [image1, image2]\n    sizeBytes: 1024\n}";
        assertEquals(expected, containerImage.toString());
    }

    //BaseRock generated method id: ${testNamesWithDifferentInputs}, hash: 61FB30629D7DDEBA49F92BEA30BFF9B1
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "image1", "image1,image2" })
    void testNamesWithDifferentInputs(String input) {
        V1ContainerImage containerImage = new V1ContainerImage();
        if (input == null) {
            containerImage.setNames(null);
            assertNull(containerImage.getNames());
        } else if (input.isEmpty()) {
            containerImage.setNames(new ArrayList<>());
            assertTrue(containerImage.getNames().isEmpty());
        } else {
            List<String> names = List.of(input.split(","));
            containerImage.setNames(names);
            assertEquals(names, containerImage.getNames());
        }
    }

    //BaseRock generated method id: ${testAddNamesItemToNullList}, hash: 9FD47477B8890EFB3FEE7F6DF23BA605
    @Test
    void testAddNamesItemToNullList() {
        V1ContainerImage containerImage = new V1ContainerImage();
        containerImage.setNames(null);
        containerImage.addNamesItem("newImage");
        assertNotNull(containerImage.getNames());
        assertEquals(1, containerImage.getNames().size());
        assertEquals("newImage", containerImage.getNames().get(0));
    }

    //BaseRock generated method id: ${testSetNullSizeBytes}, hash: 8554E25917845AA02FD656560ECE2B4E
    @Test
    void testSetNullSizeBytes() {
        V1ContainerImage containerImage = new V1ContainerImage();
        containerImage.setSizeBytes(null);
        assertNull(containerImage.getSizeBytes());
    }
}
