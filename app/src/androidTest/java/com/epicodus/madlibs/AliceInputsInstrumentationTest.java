package com.epicodus.madlibs;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagKey;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Guest on 4/19/16.
 */
public class AliceInputsInstrumentationTest {
    @Rule
    public ActivityTestRule<AliceInputs> activityTestRule =
            new ActivityTestRule<>(AliceInputs.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.adjectiveText)).perform(typeText("short"))
                .check(matches(withText("short")));
    }

    @Test
    public void wordsAreSentToSubmitActivity() {
        String noun = "horse";
        String occupation = "farmer";
        String verb = "mow";
        String exclamation = "howdy";
        String adverb = "mopily";
        String adjective = "rusty";
        String weapon = "pitchfork";
        onView(withId(R.id.nounText)).perform(typeText(noun));
        onView(withId(R.id.occupationText)).perform(typeText(occupation));
        onView(withId(R.id.verbText)).perform(typeText(verb));
        onView(withId(R.id.exclamationText)).perform(typeText(exclamation));
        onView(withId(R.id.adverbText)).perform(typeText(adverb));
        onView(withId(R.id.adjectiveText)).perform(typeText(adjective));
        onView(withId(R.id.weaponText)).perform(typeText(weapon));

        onView(withId(R.id.submitWordsButton)).perform(click());
        onView(withId(R.id.storyTextView)).check(matches
                (withText("One day there was a " + occupation + " named Alice. Like all " +
                        occupation + "s, Alice did her job in a " + noun + ". One day, a " +
                        adjective + " stranger came to the " + noun + " and shouted '" +
                        exclamation + ", Alice, I swear that I'm better at " + verb + " than you " +
                        "ever will be!' In a moment of pure rage, Alice spun around in her chair, " +
                        adverb + " drew her " + weapon + ", and brought revenge like no other " +
                        occupation + " ever had, or ever will again.")));

    }
}
