package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1GitRepoVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: B6CA4C7ADC84FF164ED8A3148D6B0C54
    @Test
    void testConstructor() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        assertNotNull(gitRepoVolumeSource);
    }

    //BaseRock generated method id: ${testSetAndGetDirectory}, hash: 8248C12971692F5492E0C2EE20213B4D
    @Test
    void testSetAndGetDirectory() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        String directory = "test-directory";
        gitRepoVolumeSource.setDirectory(directory);
        assertEquals(directory, gitRepoVolumeSource.getDirectory());
    }

    //BaseRock generated method id: ${testSetDirectoryWithVariousValues}, hash: 3FC603B561BFF970105FC8ADFB22205F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { ".", "..", "/test", "test/directory" })
    void testSetDirectoryWithVariousValues(String directory) {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        gitRepoVolumeSource.setDirectory(directory);
        assertEquals(directory, gitRepoVolumeSource.getDirectory());
    }

    //BaseRock generated method id: ${testSetAndGetRepository}, hash: CF7449D522C027FBC2E343C0A125FDC8
    @Test
    void testSetAndGetRepository() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        String repository = "https://github.com/test/repo.git";
        gitRepoVolumeSource.setRepository(repository);
        assertEquals(repository, gitRepoVolumeSource.getRepository());
    }

    //BaseRock generated method id: ${testSetRepositoryWithVariousValues}, hash: 1814F5F1EA57BF30C7C94CFD95938815
    @ParameterizedTest
    @ValueSource(strings = { "https://github.com/test/repo.git", "git@github.com:test/repo.git", "file:///path/to/repo.git" })
    void testSetRepositoryWithVariousValues(String repository) {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        gitRepoVolumeSource.setRepository(repository);
        assertEquals(repository, gitRepoVolumeSource.getRepository());
    }

    //BaseRock generated method id: ${testSetAndGetRevision}, hash: 80DBACC7A2CEBA85C5F54F54E21B2A1A
    @Test
    void testSetAndGetRevision() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        String revision = "main";
        gitRepoVolumeSource.setRevision(revision);
        assertEquals(revision, gitRepoVolumeSource.getRevision());
    }

    //BaseRock generated method id: ${testSetRevisionWithVariousValues}, hash: D2027574C83BAE78817319DAA336F217
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "main", "master", "develop", "feature/test", "v1.0.0", "a1b2c3d4" })
    void testSetRevisionWithVariousValues(String revision) {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        gitRepoVolumeSource.setRevision(revision);
        assertEquals(revision, gitRepoVolumeSource.getRevision());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 43B283BC74FCE52B515037AECA3A2539
    @Test
    void testEqualsAndHashCode() {
        V1GitRepoVolumeSource source1 = new V1GitRepoVolumeSource().directory("dir1").repository("repo1").revision("rev1");
        V1GitRepoVolumeSource source2 = new V1GitRepoVolumeSource().directory("dir1").repository("repo1").revision("rev1");
        V1GitRepoVolumeSource source3 = new V1GitRepoVolumeSource().directory("dir2").repository("repo2").revision("rev2");
        assertAll(() -> assertEquals(source1, source2), () -> assertEquals(source1.hashCode(), source2.hashCode()), () -> assertThat(source1, is(equalTo(source2))), () -> assertThat(source1, is(not(equalTo(source3)))));
    }

    //BaseRock generated method id: ${testToString}, hash: 3774CF506799996CC80745480083B40D
    @Test
    void testToString() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource().directory("test-dir").repository("https://github.com/test/repo.git").revision("main");
        String toString = gitRepoVolumeSource.toString();
        assertAll(() -> assertThat(toString, is(notNullValue())), () -> assertThat(toString, containsString("directory")), () -> assertThat(toString, containsString("repository")), () -> assertThat(toString, containsString("revision")));
    }

    //BaseRock generated method id: ${testBuilder}, hash: E2B6D6E0780E9982C2034FCDAE63D4D9
    @Test
    void testBuilder() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource().directory("test-dir").repository("https://github.com/test/repo.git").revision("main");
        assertAll(() -> assertEquals("test-dir", gitRepoVolumeSource.getDirectory()), () -> assertEquals("https://github.com/test/repo.git", gitRepoVolumeSource.getRepository()), () -> assertEquals("main", gitRepoVolumeSource.getRevision()));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: D7D7E5E36D209349067AA6E522CC6117
    @Test
    void testSetNullValues() {
        V1GitRepoVolumeSource gitRepoVolumeSource = new V1GitRepoVolumeSource();
        assertAll(() -> {
            gitRepoVolumeSource.setDirectory(null);
            assertThat(gitRepoVolumeSource.getDirectory(), is(nullValue()));
        }, () -> {
            gitRepoVolumeSource.setRepository(null);
            assertThat(gitRepoVolumeSource.getRepository(), is(nullValue()));
        }, () -> {
            gitRepoVolumeSource.setRevision(null);
            assertThat(gitRepoVolumeSource.getRevision(), is(nullValue()));
        });
    }
}
