class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        List<String> ans = new ArrayList<>();

        HashSet<String> set = new HashSet<>();

        for(String i : supplies){
            set.add(i);
        }

        boolean updated = true;

        while(updated == true){
            updated = false;

            for(int i=0; i<ingredients.size(); i++){

                if(set.contains(recipes[i])){
                      continue;
                }

                List<String> curr = ingredients.get(i);

                boolean isPresent = true;

                for(int j=0; j<curr.size(); j++){
                    if(set.contains(curr.get(j)) == false){
                        isPresent = false;
                        break;
                    }
                }

                if(isPresent == true){
                    set.add(recipes[i]);
                    ans.add(recipes[i]);

                    updated = true;
                }

                
            }
        }
        System.out.print(set);
        return ans;
    }
}