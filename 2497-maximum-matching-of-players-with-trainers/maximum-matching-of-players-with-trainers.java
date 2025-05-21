class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);

        int player = 0;
        int trainer = 0;

        int count = 0;

        while(player < players.length && trainer < trainers.length){
            
            if(trainers[trainer] >= players[player]){
                count++;
                player++;
            }
            trainer++;
        }

        return count;
    }
}