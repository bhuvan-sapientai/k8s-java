package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.VersionInfo;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class VersionInfoBaseRockGeneratedTest {

    private VersionInfo versionInfo;

    @BeforeEach
    void setUp() {
        versionInfo = new VersionInfo();
    }

    //BaseRock generated method id: ${testBuildDate}, hash: 252B23AE7E11DD7108E8826D4A4A59C0
    @Test
    void testBuildDate() {
        String buildDate = "2025-02-12";
        versionInfo.setBuildDate(buildDate);
        assertEquals(buildDate, versionInfo.getBuildDate());
    }

    //BaseRock generated method id: ${testCompiler}, hash: 36E1842669EBC6DA39D2DF1DD1A5578A
    @Test
    void testCompiler() {
        String compiler = "javac";
        versionInfo.setCompiler(compiler);
        assertEquals(compiler, versionInfo.getCompiler());
    }

    //BaseRock generated method id: ${testGitCommit}, hash: 7CDD7D9AC8EFAF3D571CE62D44EAEE22
    @Test
    void testGitCommit() {
        String gitCommit = "abc123";
        versionInfo.setGitCommit(gitCommit);
        assertEquals(gitCommit, versionInfo.getGitCommit());
    }

    //BaseRock generated method id: ${testGitTreeState}, hash: 3C95F0117C3F75DC9ED50CE25A92BD74
    @Test
    void testGitTreeState() {
        String gitTreeState = "clean";
        versionInfo.setGitTreeState(gitTreeState);
        assertEquals(gitTreeState, versionInfo.getGitTreeState());
    }

    //BaseRock generated method id: ${testGitVersion}, hash: 27BBA053E7F9F33D2AC2D0BAC2F53BF3
    @Test
    void testGitVersion() {
        String gitVersion = "v1.0.0";
        versionInfo.setGitVersion(gitVersion);
        assertEquals(gitVersion, versionInfo.getGitVersion());
    }

    //BaseRock generated method id: ${testGoVersion}, hash: D482AA342F20452E7A156DA06AE7D96B
    @Test
    void testGoVersion() {
        String goVersion = "go1.16";
        versionInfo.setGoVersion(goVersion);
        assertEquals(goVersion, versionInfo.getGoVersion());
    }

    //BaseRock generated method id: ${testMajor}, hash: 355BBA20C9C67CDE767AD904D0958C90
    @Test
    void testMajor() {
        String major = "1";
        versionInfo.setMajor(major);
        assertEquals(major, versionInfo.getMajor());
    }

    //BaseRock generated method id: ${testMinor}, hash: 2690A31090980F4CE9B3E8F09867178B
    @Test
    void testMinor() {
        String minor = "0";
        versionInfo.setMinor(minor);
        assertEquals(minor, versionInfo.getMinor());
    }

    //BaseRock generated method id: ${testPlatform}, hash: EFC7109AA3A7BE9FDD9D6053FE07DA29
    @Test
    void testPlatform() {
        String platform = "linux/amd64";
        versionInfo.setPlatform(platform);
        assertEquals(platform, versionInfo.getPlatform());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5BBE7DA12D25C5BCCF7D2FC7EDEF13A6
    @Test
    void testEquals() {
        VersionInfo versionInfo1 = new VersionInfo().buildDate("2025-02-12").compiler("javac").gitCommit("abc123").gitTreeState("clean").gitVersion("v1.0.0").goVersion("go1.16").major("1").minor("0").platform("linux/amd64");
        VersionInfo versionInfo2 = new VersionInfo().buildDate("2025-02-12").compiler("javac").gitCommit("abc123").gitTreeState("clean").gitVersion("v1.0.0").goVersion("go1.16").major("1").minor("0").platform("linux/amd64");
        assertThat(versionInfo1, is(equalTo(versionInfo2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DB3F076FFE29564BB897FDBE0A00AB26
    @Test
    void testHashCode() {
        VersionInfo versionInfo1 = new VersionInfo().buildDate("2025-02-12").compiler("javac").gitCommit("abc123").gitTreeState("clean").gitVersion("v1.0.0").goVersion("go1.16").major("1").minor("0").platform("linux/amd64");
        VersionInfo versionInfo2 = new VersionInfo().buildDate("2025-02-12").compiler("javac").gitCommit("abc123").gitTreeState("clean").gitVersion("v1.0.0").goVersion("go1.16").major("1").minor("0").platform("linux/amd64");
        assertEquals(versionInfo1.hashCode(), versionInfo2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4A70E83BFC27429C182CBBD6391F767A
    @Test
    void testToString() {
        VersionInfo versionInfo = new VersionInfo().buildDate("2025-02-12").compiler("javac").gitCommit("abc123").gitTreeState("clean").gitVersion("v1.0.0").goVersion("go1.16").major("1").minor("0").platform("linux/amd64");
        String expectedString = "class VersionInfo {\n" + "    buildDate: 2025-02-12\n" + "    compiler: javac\n" + "    gitCommit: abc123\n" + "    gitTreeState: clean\n" + "    gitVersion: v1.0.0\n" + "    goVersion: go1.16\n" + "    major: 1\n" + "    minor: 0\n" + "    platform: linux/amd64\n" + "}";
        assertEquals(expectedString, versionInfo.toString());
    }

    //BaseRock generated method id: ${testConstructor}, hash: A43B970FF106740ACEC9D2B3BDD0C80E
    @Test
    void testConstructor() {
        assertNotNull(new VersionInfo());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 608E3E9FEB91E0B1E71CB38A8A2B4792
    @Test
    void testBuilderPattern() {
        VersionInfo versionInfo = new VersionInfo().buildDate("2025-02-12").compiler("javac").gitCommit("abc123").gitTreeState("clean").gitVersion("v1.0.0").goVersion("go1.16").major("1").minor("0").platform("linux/amd64");
        assertThat(versionInfo, is(notNullValue()));
        assertEquals("2025-02-12", versionInfo.getBuildDate());
        assertEquals("javac", versionInfo.getCompiler());
        assertEquals("abc123", versionInfo.getGitCommit());
        assertEquals("clean", versionInfo.getGitTreeState());
        assertEquals("v1.0.0", versionInfo.getGitVersion());
        assertEquals("go1.16", versionInfo.getGoVersion());
        assertEquals("1", versionInfo.getMajor());
        assertEquals("0", versionInfo.getMinor());
        assertEquals("linux/amd64", versionInfo.getPlatform());
    }
}
