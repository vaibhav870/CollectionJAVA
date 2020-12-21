package Sets;

import java.util.EnumSet;

public class EnumSetConcept {

	enum Lang {
		JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY
	}

	public static void main(String[] args) {

		EnumSet<Lang> esl = EnumSet.allOf(Lang.class);

		System.out.println(esl);
			
		EnumSet<Lang> ranged= esl.range(Lang.JAVASCRIPT, Lang.PYTHON);
		System.out.println(ranged);
	}

}
