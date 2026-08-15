class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int j=0;
        int c=0;
        while(j<sandwiches.length){
            if(q.peek()==sandwiches[j]){
                q.remove();
                j++;
                c=0;
            }
            else{
                c++;
                q.add(q.remove());
                if(c>sandwiches.length){
                    return q.size();
                }
            }
        }
        return 0;
        
    }
}