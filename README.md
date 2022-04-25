```
# Rapport

**Skriv din rapport här!**

- Created a new xml file for the new Activity, which automatically generated a new class and added the second activity in the manifest file.
- Added a button to the main activity,  which when clicked on is going to start the second activity.

```
<Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Start Activity2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

```
- Added an OnClickListener to the button and inside of the method i created an Intent that starts the second activity when the button is clicked.activity
- Also added a name as an extra to the intent bundle, which the second activity is gonna show when it starts.

```
button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", "Faysal");
                startActivity(intent);
            }
```
- In the second activity xml file i created 2 textViews. One which shows that we are on the second activity and one that shows the extra that
  we added to the intent in the main activity.activity.

```
<TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Second Activity"
        android:textSize="40sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
    <TextView
        android:id="@+id/data"
        android:textSize="30sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Data"
        app:layout_constraintBottom_toTopOf="@+id/textView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

- Added a bundle in the SecondActivity class to receive the extras we passed in the intent  and set it to the data textView so that it shows
  on the screen.




```

Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("name");
            myName.setText(name);
        }

```

![](android.png)