package com.fox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingLapsInfoTest {

	RacingLapsInfo reader;

	@BeforeEach
	void init() {
		reader = new RacingLapsInfo();
	}

	@Test
	@DisplayName(" Given input is  null  then throw  exception")
	void givenInputIsNull_whenReadLogFile_thenThrowException() {
		assertThrows(NullPointerException.class, () -> reader.readLogFile(null));
	}

	@Test
	@DisplayName("Given file then read lines from file")
	void givenFile_whenReadLogFile_thenReadLinesFromFile() throws IOException {
		String inputFile = "start.log";

		List<String> expected = Arrays.asList("SVF2018-05-24_12:02:58.917", "NHR2018-05-24_12:02:49.914",
				"FAM2018-05-24_12:13:04.512", "KRF2018-05-24_12:03:01.250", "SVM2018-05-24_12:18:37.735",
				"MES2018-05-24_12:04:45.513", "LSW2018-05-24_12:06:13.511", "BHS2018-05-24_12:14:51.985",
				"EOF2018-05-24_12:17:58.810", "RGH2018-05-24_12:05:14.511", "SSW2018-05-24_12:16:11.648",
				"KMH2018-05-24_12:02:51.003", "PGS2018-05-24_12:07:23.645", "CSR2018-05-24_12:03:15.145",
				"SPF2018-05-24_12:12:01.035", "DRR2018-05-24_12:14:12.054", "LHM2018-05-24_12:18:20.125",
				"CLS2018-05-24_12:09:41.921", "VBM2018-05-24_12:00:00.000");

		List<String> actual = reader.readLogFile(inputFile);

		assertEquals(expected.toString(), actual.toString());
	}

	@Test
	@DisplayName("When file is  missing then throw exception")
	void givenMissingFile_whenReadLogFile_thenThrowException() {
		String inputFile = "star_t.log";

		Exception thrownException = assertThrows(IllegalArgumentException.class, () -> reader.readLogFile(inputFile));

		assertEquals("File " + inputFile + " is not found.", thrownException.getMessage());
	}
}
