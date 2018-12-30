package com.github.stakhanov_founder.stakhanov.slack;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlackHelper {

    public List<MentionLocation> extractDirectMentions(String slackMessageContent) {
        Pattern pattern = Pattern.compile("(<@.*?>)");
        Matcher matcher = pattern.matcher(slackMessageContent);
        List<MentionLocation> result = new ArrayList<>();
        while (matcher.find()) {
            int start = matcher.start(1);
            int end = matcher.end(1);
            String id = slackMessageContent.substring(start + 2, end - 1);
            result.add(new MentionLocation(start, end - start, id));
        }
        return result;
    }
}
