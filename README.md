# Realm-RealmChangeListener
Using RealmChangeListener in Android to get notified when there is any change in the database and we can perform certain codes, if change in database occured.

# Step-1 : Creating Variable

you can create RealmChangeListener variable as same as normal variable creation.

RealmChangeListener realmChangeListener;

# Step-2 : Creating ChangeListene method

realmChangeListener = new RealmChangeListener() {
            @Override
            public void onChange(Object o) {
                // code to execute in onChange
            }
        };
        
# Step-3 : Adding it to Realm

The last step is to add the "realmChangeListener" we created to the Realm object.

realm.addChangeListener(realmChangeListener);

Thats all..

So the whole code looks like this:

RealmChangeListener realmChangeListener;
realmChangeListener = new RealmChangeListener() {
            @Override
            public void onChange(Object o) {
                // code to execute in onChange
            }
        };
realm.addChangeListener(realmChangeListener);

You can also have a look at the sample code of android given above. Thanks
