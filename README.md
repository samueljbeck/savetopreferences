# savetopreferences
Simple Library for adding and removing values from preferences

```
com.sameljbeck.utilities:savetopreferences:0.0.3

```

### Java Use:

``` 
###set value
new PreferenceSave().set(context, "key", "value")

###get value
new PreferenceSave().get(context, "key")

###getIfContains. returns a default value if the value is not in preferences
new PreferenceSave().get(context, "key", "value")

###clear value
new PreferencesSave().clear(context, "key")

###contains checks if a key is present
new PreferenceSave().contains(context, "key")

###setBool saves boolean as string
new PreferenceSave().setBool(context, "key", boolean)

###getBool gets string as boolean. //defaults to false
new PreferenceSave().getBool(context, "key")
```

###Kotlin Use
``` 
###set value
PreferenceSave().set(context, "key", "value")

###get value
PreferenceSave().get(context, "key")

###getIfContains. returns a default value if the value is not in preferences
PreferenceSave().get(context, "key", "value")

###clear value
PreferencesSave().clear(context, "key")

###contains checks if a key is present
PreferenceSave().contains(context, "key")

###setBool saves boolean as string
PreferenceSave().setBool(context, "key", boolean)

###getBool gets string as boolean. //defaults to false
PreferenceSave().getBool(context, "key")
```





