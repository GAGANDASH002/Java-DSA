class Backtracking{
    public static void FindAllSubsets(String str, String res, int i){
        // base case
        if(i == str.length()){
            if(res.length() == 0){
                System.out.println("NULL");
            }
            System.out.println(res);
            return;
        }

        // recursion
        // yes choice
        FindAllSubsets(str, res+str.charAt(i), i+1);
        // no choice
        FindAllSubsets(str, res, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        FindAllSubsets(str, "", 0);
    }
}