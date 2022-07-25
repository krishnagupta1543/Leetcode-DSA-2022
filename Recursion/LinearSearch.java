// Linear search and find the multiple index of the target in the arraylist

static ArrayList<Integer> Linearsearchmultiple(int [] arr , int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();

        if(idx == arr.length) return ans;
	else if(arr[idx] == target){
            ans.add(idx);
        }
	// important NOTE : at each fuction call we are creating the new arraylist ans but when base condition hit we start adding the idividual arraylist of each fuction call
        ans.addAll(Linearsearchmultiple(arr, target, idx+1));
        return ans;
    }
