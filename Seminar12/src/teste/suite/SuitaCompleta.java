package teste.suite;

import clase.PachetTuristic;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PachetTuristicWithFixture;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristic.class, PachetTuristicWithFixture.class, PachetTuristicTest.class})

public class SuitaCompleta {

}
