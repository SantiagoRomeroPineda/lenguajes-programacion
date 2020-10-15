// Generated from Bot.g4 by ANTLR 4.4
package co.edu.javeriana.bot;


	import org.jpavlich.bot.*;
	import org.jpavlich.bot.Bot;
	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(@NotNull BotParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(@NotNull BotParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull BotParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull BotParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(@NotNull BotParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(@NotNull BotParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull BotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull BotParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#down_movement}.
	 * @param ctx the parse tree
	 */
	void enterDown_movement(@NotNull BotParser.Down_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#down_movement}.
	 * @param ctx the parse tree
	 */
	void exitDown_movement(@NotNull BotParser.Down_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(@NotNull BotParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(@NotNull BotParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull BotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull BotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#up_movement}.
	 * @param ctx the parse tree
	 */
	void enterUp_movement(@NotNull BotParser.Up_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#up_movement}.
	 * @param ctx the parse tree
	 */
	void exitUp_movement(@NotNull BotParser.Up_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull BotParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull BotParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#both}.
	 * @param ctx the parse tree
	 */
	void enterBoth(@NotNull BotParser.BothContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#both}.
	 * @param ctx the parse tree
	 */
	void exitBoth(@NotNull BotParser.BothContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#right_movement}.
	 * @param ctx the parse tree
	 */
	void enterRight_movement(@NotNull BotParser.Right_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#right_movement}.
	 * @param ctx the parse tree
	 */
	void exitRight_movement(@NotNull BotParser.Right_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull BotParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull BotParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull BotParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull BotParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void enterPick(@NotNull BotParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void exitPick(@NotNull BotParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(@NotNull BotParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(@NotNull BotParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull BotParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull BotParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull BotParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull BotParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull BotParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull BotParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull BotParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull BotParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull BotParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull BotParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#left_movement}.
	 * @param ctx the parse tree
	 */
	void enterLeft_movement(@NotNull BotParser.Left_movementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#left_movement}.
	 * @param ctx the parse tree
	 */
	void exitLeft_movement(@NotNull BotParser.Left_movementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIf_conditional(@NotNull BotParser.If_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIf_conditional(@NotNull BotParser.If_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull BotParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull BotParser.AssignContext ctx);
}