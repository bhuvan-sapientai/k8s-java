package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DownwardAPIVolumeFileBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3427EF687C885B9077D498CA950D8498
    @Test
    void testConstructor() {
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        assertThat(volumeFile, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFieldRef}, hash: F65D109CCDE0AD4C4B5DB0D5F286B6C7
    @Test
    void testFieldRef() {
        V1ObjectFieldSelector fieldRef = mock(V1ObjectFieldSelector.class);
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile().fieldRef(fieldRef);
        assertThat(volumeFile.getFieldRef(), is(equalTo(fieldRef)));
    }

    //BaseRock generated method id: ${testMode}, hash: 31ECD29E0D6FFFEB74DDCA955EDA29E3
    @Test
    void testMode() {
        Integer mode = 644;
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile().mode(mode);
        assertThat(volumeFile.getMode(), is(equalTo(mode)));
    }

    //BaseRock generated method id: ${testPath}, hash: 8C1D3137C7BAFED255DAA4247EDD4816
    @Test
    void testPath() {
        String path = "/etc/config";
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile().path(path);
        assertThat(volumeFile.getPath(), is(equalTo(path)));
    }

    //BaseRock generated method id: ${testResourceFieldRef}, hash: BC17D797113F8B0E875B618CB57C4720
    @Test
    void testResourceFieldRef() {
        V1ResourceFieldSelector resourceFieldRef = mock(V1ResourceFieldSelector.class);
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile().resourceFieldRef(resourceFieldRef);
        assertThat(volumeFile.getResourceFieldRef(), is(equalTo(resourceFieldRef)));
    }

    //BaseRock generated method id: ${testSetFieldRef}, hash: CB1360346A222616B321A1E164B9A330
    @Test
    void testSetFieldRef() {
        V1ObjectFieldSelector fieldRef = mock(V1ObjectFieldSelector.class);
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        volumeFile.setFieldRef(fieldRef);
        assertThat(volumeFile.getFieldRef(), is(equalTo(fieldRef)));
    }

    //BaseRock generated method id: ${testSetMode}, hash: 48AA798C0E1B3C5B0D1D59E988ACB06D
    @Test
    void testSetMode() {
        Integer mode = 755;
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        volumeFile.setMode(mode);
        assertThat(volumeFile.getMode(), is(equalTo(mode)));
    }

    //BaseRock generated method id: ${testSetPath}, hash: F9244E12C01AAB54BE528F192E6CA1FB
    @Test
    void testSetPath() {
        String path = "/var/log";
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        volumeFile.setPath(path);
        assertThat(volumeFile.getPath(), is(equalTo(path)));
    }

    //BaseRock generated method id: ${testSetResourceFieldRef}, hash: E3C36E0F80C2808CFEB029178F82F5C8
    @Test
    void testSetResourceFieldRef() {
        V1ResourceFieldSelector resourceFieldRef = mock(V1ResourceFieldSelector.class);
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        volumeFile.setResourceFieldRef(resourceFieldRef);
        assertThat(volumeFile.getResourceFieldRef(), is(equalTo(resourceFieldRef)));
    }

    //BaseRock generated method id: ${testEquals}, hash: B21EA51E0966C4F0EEF9962FCE911021
    @Test
    void testEquals() {
        V1ObjectFieldSelector fieldRef = mock(V1ObjectFieldSelector.class);
        V1ResourceFieldSelector resourceFieldRef = mock(V1ResourceFieldSelector.class);
        V1DownwardAPIVolumeFile volumeFile1 = new V1DownwardAPIVolumeFile().fieldRef(fieldRef).mode(644).path("/etc/config").resourceFieldRef(resourceFieldRef);
        V1DownwardAPIVolumeFile volumeFile2 = new V1DownwardAPIVolumeFile().fieldRef(fieldRef).mode(644).path("/etc/config").resourceFieldRef(resourceFieldRef);
        assertThat(volumeFile1.equals(volumeFile2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7DB8422838100DDF0618E58ED2005E5A
    @Test
    void testHashCode() {
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile().fieldRef(mock(V1ObjectFieldSelector.class)).mode(644).path("/etc/config").resourceFieldRef(mock(V1ResourceFieldSelector.class));
        assertThat(volumeFile.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: ECD15DF8C81C94301F9602AAA073996C
    @Test
    void testToString() {
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile().fieldRef(mock(V1ObjectFieldSelector.class)).mode(644).path("/etc/config").resourceFieldRef(mock(V1ResourceFieldSelector.class));
        String result = volumeFile.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("fieldRef"), is(true));
        assertThat(result.contains("mode"), is(true));
        assertThat(result.contains("path"), is(true));
        assertThat(result.contains("resourceFieldRef"), is(true));
    }

    //BaseRock generated method id: ${testSetNullPath}, hash: 2D3AEED47827280311F8538FF6EAF197
    @Test
    void testSetNullPath() {
        V1DownwardAPIVolumeFile volumeFile = new V1DownwardAPIVolumeFile();
        assertThat(volumeFile.path(null), is(volumeFile));
        assertThat(volumeFile.getPath(), is(equalTo(null)));
    }
}
