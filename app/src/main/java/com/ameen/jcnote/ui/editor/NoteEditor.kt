package com.ameen.jcnote.ui.editor

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ameen.jcnote.ui.theme.JCNoteTheme
import com.ameen.jcnote.ui.theme.PurpleGrey40

@Composable
fun NoteEditor() {
    var titleText by remember {
        mutableStateOf("")
    }
    var contentText by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(horizontal = 6.dp)
    ) {

        Spacer(modifier = Modifier.height(2.dp))
        TextField(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
            value = titleText,
            onValueChange = { titleText = it },
            placeholder = {
                Text(text = "Note Title", color = PurpleGrey40, fontSize = 25.sp)
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                placeholderColor = PurpleGrey40
            ),
            textStyle = TextStyle(
                fontSize = 25.sp,
            )
        )

        TextField(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(1f),
            value = contentText,
            onValueChange = { contentText = it },
            placeholder = {
                Text(text = "Write Your Note here", color = PurpleGrey40)
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                placeholderColor = PurpleGrey40
            ),
            textStyle = TextStyle(
                fontSize = 16.sp
            )
        )
        Text(
            text = "Last Modification: 12 Aug, 2022",
            color = PurpleGrey40,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Right,
            fontSize = 12.sp
        )
    }

}

@Preview
@Composable
fun NoteEditorPreview() {
    JCNoteTheme {
        NoteEditor()
    }
}