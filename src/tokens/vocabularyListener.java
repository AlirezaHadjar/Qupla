// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vocabularyParser}.
 */
public interface vocabularyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(vocabularyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(vocabularyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(vocabularyParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(vocabularyParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(vocabularyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(vocabularyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(vocabularyParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(vocabularyParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#textExp}.
	 * @param ctx the parse tree
	 */
	void enterTextExp(vocabularyParser.TextExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#textExp}.
	 * @param ctx the parse tree
	 */
	void exitTextExp(vocabularyParser.TextExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(vocabularyParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(vocabularyParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void enterMathExp(vocabularyParser.MathExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void exitMathExp(vocabularyParser.MathExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(vocabularyParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(vocabularyParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(vocabularyParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(vocabularyParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(vocabularyParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(vocabularyParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(vocabularyParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(vocabularyParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(vocabularyParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(vocabularyParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#createModule}.
	 * @param ctx the parse tree
	 */
	void enterCreateModule(vocabularyParser.CreateModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#createModule}.
	 * @param ctx the parse tree
	 */
	void exitCreateModule(vocabularyParser.CreateModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(vocabularyParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(vocabularyParser.ReturnValueContext ctx);
}