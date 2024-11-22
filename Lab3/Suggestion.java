public class Suggestion {
    public void suggestShoes(Weather weather) {
        double temperature = weather.getTemperature();
        boolean rain = weather.isRain();

        if (rain && temperature < 18) {
            System.out.println("Recomendação de sapatos: Sapatos GoreTex");
        } else if (temperature > 24) {
            System.out.println("Recomendação de sapatos: Chinelos");
        } else if (temperature >= 5 && temperature <= 24) {
            System.out.println("Recomendação de sapatos: Ténis");
        } else if (temperature < 5) {
            System.out.println("Recomendação de sapatos: Botas");
        }
    }
    
    public void suggestClothes(Weather weather) {
        double temperature = weather.getTemperature();
        if (temperature > 25) {
            System.out.println("Recomendação de roupa: T-shirt");
        } else if (temperature > 18 && temperature <= 25) {
            System.out.println("Recomendação de roupa: Sweatshirt");
        } else if (temperature > 5 && temperature <= 18) {
            System.out.println("Recomendação de roupa: Casaco leve");
        } else if (temperature <= 5) {
            System.out.println("Recomendação de roupa: Casaco de Inverno");
        }
    }

    public void suggestAccessories(Weather weather) {
        int uv = weather.getUv();
        double temperature = weather.getTemperature();
        boolean rain = weather.isRain();
        int humidity = weather.getHumidity();
        if (uv > 6) {
            System.out.println("Recomendação de acessórios: Óculos de sol");
        } 
        if (temperature >= 30) {
            System.out.println("Recomendação de acessórios: Chapéu ou boné");
        } 
        if (temperature >= 25) {
            System.out.println("Recomendação de acessórios: Garrafa de água");
        } 
        if (rain || humidity > 85) {
            System.out.println("Recomendação de acessórios: Chapéu de chuva");
        }
    }
    public void suggestClothing(Weather weather) {
        double temperature = weather.getTemperature();
        boolean rain = weather.isRain();
        int humidity = weather.getHumidity();
        int uv = weather.getUv();
        String shoeSuggestion;
        if (rain && temperature < 18) {
            shoeSuggestion = "Sapatos GoreTex";
        } else if (temperature > 24) {
            shoeSuggestion = "Chinelos";
        } else if (temperature >= 5 && temperature <= 24) {
            shoeSuggestion = "Ténis";
        } else {
            shoeSuggestion = "Botas";
        }
        
        String clothingSuggestion;
        if (temperature > 25) {
            clothingSuggestion = "T-shirt";
        } else if (temperature > 18 && temperature <= 25) {
            clothingSuggestion = "Sweat-shirt";
        } else if (temperature > 5 && temperature <= 18) {
            clothingSuggestion = "Casaco leve";
        } else {
            clothingSuggestion = "Casaco de Inverno";
        }

        String accessorySuggestion = "";
        if (uv > 6) {
            accessorySuggestion += "Óculos de sol, ";
        }
        if (temperature >= 30) {
            accessorySuggestion += "Chapéu ou boné, ";
        }
        if (temperature >= 25) {
            accessorySuggestion += "Garrafa de água, ";
        }
        if (rain || humidity > 85) {
            accessorySuggestion += "Chapéu de chuva, ";
        }

        if (accessorySuggestion.endsWith(", ")) {
            accessorySuggestion = accessorySuggestion.substring(0, accessorySuggestion.length() - 2);
        }

        System.out.println("Deverias usar " + shoeSuggestion + ", com uma " + clothingSuggestion + 
                           (accessorySuggestion.isEmpty() ? "!" : ", leva também " + accessorySuggestion+"!"));

    }
}
