package com.akurupela.sta.ui

import com.intellij.ui.JBColor

/**
 * The flat green look: solid colors, one green accent, small rounded buttons. Light or dark follows the IDE's theme.
 * Components (buttons, tiles, menus, dialogs) and the code that themes a component tree are private.
 */
internal object GitTheme {
    val background = JBColor(0xF4FBF7, 0x10241B)
    val surface = JBColor(0xE6F4EC, 0x173226)
    val border = JBColor(0xCFE6D9, 0x26493A)
    val text = JBColor(0x13261D, 0xE3F2EA)
    val mutedText = JBColor(0x4F6B5D, 0x9DBFAE)
    val accent = JBColor(0x0B7A50, 0x45D99D)
    val accentFill = JBColor(0x0B7A50, 0x0B7A50)
    val selection = JBColor(0xC6EBD7, 0x1F5A41)

    // TODO: implement (full source is private)
}
