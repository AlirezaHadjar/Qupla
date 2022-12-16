import lexer.vocabularyLexer;
import org.antlr.v4.runtime.*;
import parser.vocabularyParser;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException {

        String text = "";
        try {
            String currentDirectory = System.getProperty("user.dir");
            String inputFileName = currentDirectory+"/src/"+ "4.qupla";
            text = Files.readString(Paths.get(inputFileName)).trim();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        CharStream in = CharStreams.fromString(text);
        vocabularyLexer lexer = new vocabularyLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        vocabularyParser parser = new vocabularyParser(tokens);
        parser.stat();

//        while (!lexer._hitEOF) {
//            try {
//                Token token = lexer.nextToken();
//                int type = token.getType();
//                String tokenText = token.getText();
//                if (type == Token.EOF) break;
//
//                String typeName = vocabularyLexer.VOCABULARY.getSymbolicName(type);
//                System.out.println(typeName + " -- " + tokenText);
//            } catch (RuntimeException e) {
//                System.out.println(e.getMessage());
//            }
//        }

    }
}