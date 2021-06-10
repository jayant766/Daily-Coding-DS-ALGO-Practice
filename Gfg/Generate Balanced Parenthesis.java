public List<String> AllParenthesis(int n)
{
    List<String> result = new ArrayList<String>();
    generateParenthesis(n, result, n, "");
    return result;
}

public void generateParenthesis(int leftRemaining,
        List<String> result, int rightRemaining, String res)  {
    if(leftRemaining <= 0 && rightRemaining <=0) {
    result.add(res);
    return;
    }
    if(leftRemaining < rightRemaining) {
        generateParenthesis(leftRemaining, result, rightRemaining-1, res.concat(")"));
    }
    if(leftRemaining>0) {
        generateParenthesis(leftRemaining-1, result, rightRemaining, res.concat("("));
    }
}