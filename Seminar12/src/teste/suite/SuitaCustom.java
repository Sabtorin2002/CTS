package teste.suite;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.dubluri.AreFake;

@RunWith(Categories.class)
@Suite.SuiteClasses(SuitaCustom.class)
@Categories.IncludeCategory(AreFake.class)
public class SuitaCustom {
}
