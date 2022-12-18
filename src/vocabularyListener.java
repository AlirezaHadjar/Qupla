// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vocabularyParser}.
 */
public interface vocabularyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(vocabularyParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(vocabularyParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#compoundStat}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStat(vocabularyParser.CompoundStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#compoundStat}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStat(vocabularyParser.CompoundStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#simpleStat}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStat(vocabularyParser.SimpleStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#simpleStat}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStat(vocabularyParser.SimpleStatContext ctx);
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
	 * Enter a parse tree produced by {@link vocabularyParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(vocabularyParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(vocabularyParser.EndContext ctx);
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
	 * Enter a parse tree produced by {@link vocabularyParser#callModule}.
	 * @param ctx the parse tree
	 */
	void enterCallModule(vocabularyParser.CallModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#callModule}.
	 * @param ctx the parse tree
	 */
	void exitCallModule(vocabularyParser.CallModuleContext ctx);
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
	 * Enter a parse tree produced by {@link vocabularyParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(vocabularyParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(vocabularyParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(vocabularyParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(vocabularyParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(vocabularyParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(vocabularyParser.CompareOpContext ctx);
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
	 * Enter a parse tree produced by {@link vocabularyParser#moduleInput}.
	 * @param ctx the parse tree
	 */
	void enterModuleInput(vocabularyParser.ModuleInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#moduleInput}.
	 * @param ctx the parse tree
	 */
	void exitModuleInput(vocabularyParser.ModuleInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link vocabularyParser#moduleOutput}.
	 * @param ctx the parse tree
	 */
	void enterModuleOutput(vocabularyParser.ModuleOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link vocabularyParser#moduleOutput}.
	 * @param ctx the parse tree
	 */
	void exitModuleOutput(vocabularyParser.ModuleOutputContext ctx);
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