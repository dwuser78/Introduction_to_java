public class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        final int KEY = 0;
        final int VALUE = 1;

        String param_tmp = PARAMS.replace("{", "");
        param_tmp = param_tmp.replace("}", "");
        param_tmp = param_tmp.replaceAll("\"", "");
        param_tmp = param_tmp.trim();

        StringBuilder result = new StringBuilder(QUERY);

        String [] kvPairs = param_tmp.split(", ");

        for (int i = 0; i < kvPairs.length; i++)
        {
            String[] kvData = kvPairs[i].split(":");
            if(!kvData[VALUE].equals("null"))
            {
                if (i != 0)
                    result.append(" and ");

                result.append(kvData[KEY]);
                result.append("='");
                result.append(kvData[VALUE]);
                result.append("'");
            }
        }
        return result;
    }
}