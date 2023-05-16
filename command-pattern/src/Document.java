import java.util.Stack;

public class Document {
    private Stack<String> lines = new Stack<>();

    public Stack<String> getLines() {
        return lines;
    }

    public void setLines(Stack<String> lines) {
        this.lines = lines;
    }

    public void write(String text){
        lines.push(text);
    }
    public void eraseLast(){
        if(!lines.isEmpty()){
            lines.pop();
        }
    }
    public void readDocument(){
        for(String text : lines){
            System.out.println(text);
        }
    }
}
