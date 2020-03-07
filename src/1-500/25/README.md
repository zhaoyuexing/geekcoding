zhaoyuexing@gmail.com
will try to start with this, once i figure out the idea, will put more details here

Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in k-Group.
Memory Usage: 40.8 MB, less than 5.17% of Java online submissions for Reverse Nodes in k-Group.
Next challenges:

A bit late, will put more idea here tmrw

here is the main idea for this:
1. create 1 method to find K node in list list
2. find K + 1 node base on K
3. Make K node 's next node as null, then from 1 to K is a list, then reverse it
4. Now head is tail, then like it link to next subList 's head, due to it is recursive method, so it is done.


