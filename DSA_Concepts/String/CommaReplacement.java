package String;

public class CommaReplacement {
    public static void main(String[] args) {
        String str="how, they, are,, bulubulu, kity ktiy, titty titty, ululululu";
        String updatedStr=str.replaceAll(",{2,}", ",");
        System.out.println(updatedStr);
    }
}
