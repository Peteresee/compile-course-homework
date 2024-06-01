package constant;

public class ProjectConstant {
    private ProjectConstant() {
    }

    public static final String DEFAULT_SOURCE_fILEPATH = "src\\main\\resources\\default\\defaultSrc.txt";
    public static final String DEFAULT_TARGET_fILEPATH = "src\\main\\resources\\default\\defaultTarget.txt";
    public static final String LEXTYPE_HANDLER_CLASSPATH = "src\\main\\java\\lexical_analysis\\" +
            "util\\chain\\lexType\\handler\\impl";
    public static final String LEXTYPE_HANDLER_FULL_CLASSPATH = "lexical_analysis." +
            "util.chain.lexType.handler.impl.";

    public static final String ESCAPED_SPACE = "空格";
    public static final String DEFAULT_TOKEN_EXCEL_FILEPATH = "src\\main\\resources\\default\\defaultToken.xlsx";

    public static final String DEFAULT_SYNTAX_TREE_TEXT_FILEPATH = "src\\main\\resources\\default\\" +
            "defaultSyntaxTreeText.txt";
    public static final String DEFAULT_SYNTAX_TREE_GRAPH_FILEPATH = "src\\main\\resources\\default\\" +
            "defaultSyntaxTreeGraph.txt";

}