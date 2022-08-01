package com.ameen.jcnote.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ameen.jcnote.R

@Composable
fun NoteItem(title: String, content: String, date: String) {
    Card(title = title, content = content, date = date)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Card(title: String, content: String, date: String) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.clip(RoundedCornerShape(10.dp)),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = content,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = date,
                fontSize = 12.sp,
                modifier = Modifier.align(Alignment.End),
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }
    }
}

@Preview
@Composable
fun DefaultItemPreview() {
    NoteItem(title = "Jetpack Compose", content = stringResource(R.string.noteContentTest), date = "5, Aug 2022")
}