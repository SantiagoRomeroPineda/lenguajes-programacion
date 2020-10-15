
package co.edu.javeriana.bot;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jpavlich.bot.Bot;
import org.jpavlich.bot.BotApplication;

public class Main {

	private static final String EXTENSION = "bot";

	public static void main(String[] args) throws IOException {

		BotApplication app = new BotApplication(50) {

			@Override
			protected void execute(Bot bot) throws Throwable {
				String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

				BotLexer lexer = new BotLexer(new ANTLRFileStream(program));

				System.out.println("Interpreting file " + program);

				CommonTokenStream tokens = new CommonTokenStream(lexer);
				BotParser parser = new BotParser(tokens, bot);
				

				BotParser.ProgramContext tree = parser.program();

				BotCustomVisitor visitor = new BotCustomVisitor();
				visitor.visit(tree);

				System.out.println("Interpretation finished");

			}
		};
		app.start();

	}

}




//BotApplication app = new BotApplication(50) {
//
//	@Override
//	protected void execute(Bot bot) throws Throwable {
//		for (int j = 0; j < 8; j++) {
//			for (int i = 0; i < 12; i++) {
//				bot.right(1);
//				printLook(bot);
//			}
//			bot.down(1);
//			printLook(bot);
//			for (int i = 0; i < 12; i++) {
//				bot.left(1);
//				printLook(bot);
//			}
//			bot.down(1);
//			printLook(bot);
//		}
//	}
//
//	private void printLook(Bot bot) {
//		int look = bot.look();
//		if (look > 0) {
//			System.out.println(look);
//		}
//	}
//};
//
//app.start();
