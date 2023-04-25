import java.util.*;


class Solution {
    public int solution(int cacheSize, String[] cities) {
        LinkedHashMap<String,Integer> cache = new LinkedHashMap<>();
        
        int answer = 0;
        
        
        String[] convertedCities = new String[cities.length];
        
        for(int i=0; i<cities.length; i++) {
            convertedCities[i] = cities[i].toUpperCase();
        }        
        
        if(cacheSize == 0) {
            return convertedCities.length * 5;
        }
        
        
        for(String city : convertedCities) {
            if(cache.containsKey(city)) {
                answer += 1;
                cache.remove(city);
                cache.put(city, 0);
            }else {
                answer += 5;
                if(cache.size() == cacheSize) {
                    String first = cache.keySet().iterator().next();
                    
                    cache.remove(first);
                    cache.put(city, 0);
                }else{
                    cache.put(city, 0);
                }
            }
        }
        
        return answer;
    }
}