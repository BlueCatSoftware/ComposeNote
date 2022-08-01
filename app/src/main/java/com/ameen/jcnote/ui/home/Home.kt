package com.ameen.jcnote.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.TopAppBar
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Dehaze
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController?) {
    Scaffold(
        topBar = {
            TopAppBar(
                contentPadding = PaddingValues(0.dp),
                backgroundColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onSurface,
                elevation = 0.dp,
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 12.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                ToolBarContent(Modifier.weight(1f))
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController?.navigate("editor") },
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
            ) {
                Icon(Icons.Rounded.Add, contentDescription = "Add")
            }
        },
        content = {
            NoteList(it)
        }
    )
}

@Preview
@Composable
fun HomePreview() {
    Home(null)
}

@Composable
fun ToolBarContent(modifier: Modifier) {
    var searchText by remember {
        mutableStateOf("")
    }
    Icon(Icons.Rounded.Dehaze, "Drawer", Modifier.padding(start = 12.dp))
    BasicTextField(
        value = searchText,
        onValueChange = { searchText = it },
        modifier = modifier,
        textStyle = TextStyle()
    ) {
        Text(text = "search", modifier = Modifier.padding(8.dp))
    }
    Icon(Icons.Rounded.Search, "Search", Modifier.padding(end = 12.dp))

}

