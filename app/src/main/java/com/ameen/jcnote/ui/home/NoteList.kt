package com.ameen.jcnote.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameen.jcnote.R

@Composable
fun NoteList(dp: PaddingValues) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(6.dp),
        modifier = Modifier.padding(dp),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(
            count = 10
        ) {
            NoteItem(
                title = "Jetpack Compose",
                content = stringResource(R.string.noteContentTest),
                date = "5, Aug 2022"
            )
        }
    }
}


@Preview
@Composable
fun DefaultPreview() {
    NoteList(PaddingValues(1.dp))
}

