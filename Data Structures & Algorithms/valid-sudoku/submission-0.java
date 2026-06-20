class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n= board.length;

        HashSet<Character> rows[]= new HashSet[9];
        HashSet<Character> cols[]= new HashSet[9];
        HashSet<Character> boxes[]= new HashSet[9];

        for(int i=0;i<n;i++){
            rows[i]= new HashSet<Character>();
            cols[i]= new HashSet<Character>();
            boxes[i]= new HashSet<Character>();
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(board[r][c]=='.')
                    continue;
                
                char num = board[r][c];

                int box=(r/3)*3 + c/3;

                if(rows[r].contains(num) || cols[c].contains(num)||
                boxes[box].contains(num))
                    return false;
                
                rows[r].add(num);
                cols[c].add(num);
                boxes[box].add(num);
            }
        } 
        return true;
    }
}
