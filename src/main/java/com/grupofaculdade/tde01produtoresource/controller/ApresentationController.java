package com.grupofaculdade.tde01produtoresource.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/apresentation")
public class ApresentationController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> findAll() {
        String html =  "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/><title>API PRODUTO - TRABALHO WEBSEGUROS</title><style>\n" +
                "/* cspell:disable-file */\n" +
                "/* webkit printing magic: print all background colors */\n" +
                "html {\n" +
                "\t-webkit-print-color-adjust: exact;\n" +
                "}\n" +
                "* {\n" +
                "\tbox-sizing: border-box;\n" +
                "\t-webkit-print-color-adjust: exact;\n" +
                "}\n" +
                "\n" +
                "html,\n" +
                "body {\n" +
                "\tmargin: 0;\n" +
                "\tpadding: 0;\n" +
                "}\n" +
                "@media only screen {\n" +
                "\tbody {\n" +
                "\t\tmargin: 2em auto;\n" +
                "\t\tmax-width: 900px;\n" +
                "\t\tcolor: rgb(55, 53, 47);\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "\tline-height: 1.5;\n" +
                "\twhite-space: pre-wrap;\n" +
                "}\n" +
                "\n" +
                "a,\n" +
                "a.visited {\n" +
                "\tcolor: inherit;\n" +
                "\ttext-decoration: underline;\n" +
                "}\n" +
                "\n" +
                ".pdf-relative-link-path {\n" +
                "\tfont-size: 80%;\n" +
                "\tcolor: #444;\n" +
                "}\n" +
                "\n" +
                "h1,\n" +
                "h2,\n" +
                "h3 {\n" +
                "\tletter-spacing: -0.01em;\n" +
                "\tline-height: 1.2;\n" +
                "\tfont-weight: 600;\n" +
                "\tmargin-bottom: 0;\n" +
                "}\n" +
                "\n" +
                ".page-title {\n" +
                "\tfont-size: 2.5rem;\n" +
                "\tfont-weight: 700;\n" +
                "\tmargin-top: 0;\n" +
                "\tmargin-bottom: 0.75em;\n" +
                "}\n" +
                "\n" +
                "h1 {\n" +
                "\tfont-size: 1.875rem;\n" +
                "\tmargin-top: 1.875rem;\n" +
                "}\n" +
                "\n" +
                "h2 {\n" +
                "\tfont-size: 1.5rem;\n" +
                "\tmargin-top: 1.5rem;\n" +
                "}\n" +
                "\n" +
                "h3 {\n" +
                "\tfont-size: 1.25rem;\n" +
                "\tmargin-top: 1.25rem;\n" +
                "}\n" +
                "\n" +
                ".source {\n" +
                "\tborder: 1px solid #ddd;\n" +
                "\tborder-radius: 3px;\n" +
                "\tpadding: 1.5em;\n" +
                "\tword-break: break-all;\n" +
                "}\n" +
                "\n" +
                ".callout {\n" +
                "\tborder-radius: 3px;\n" +
                "\tpadding: 1rem;\n" +
                "}\n" +
                "\n" +
                "figure {\n" +
                "\tmargin: 1.25em 0;\n" +
                "\tpage-break-inside: avoid;\n" +
                "}\n" +
                "\n" +
                "figcaption {\n" +
                "\topacity: 0.5;\n" +
                "\tfont-size: 85%;\n" +
                "\tmargin-top: 0.5em;\n" +
                "}\n" +
                "\n" +
                "mark {\n" +
                "\tbackground-color: transparent;\n" +
                "}\n" +
                "\n" +
                ".indented {\n" +
                "\tpadding-left: 1.5em;\n" +
                "}\n" +
                "\n" +
                "hr {\n" +
                "\tbackground: transparent;\n" +
                "\tdisplay: block;\n" +
                "\twidth: 100%;\n" +
                "\theight: 1px;\n" +
                "\tvisibility: visible;\n" +
                "\tborder: none;\n" +
                "\tborder-bottom: 1px solid rgba(55, 53, 47, 0.09);\n" +
                "}\n" +
                "\n" +
                "img {\n" +
                "\tmax-width: 100%;\n" +
                "}\n" +
                "\n" +
                "@media only print {\n" +
                "\timg {\n" +
                "\t\tmax-height: 100vh;\n" +
                "\t\tobject-fit: contain;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "@page {\n" +
                "\tmargin: 1in;\n" +
                "}\n" +
                "\n" +
                ".collection-content {\n" +
                "\tfont-size: 0.875rem;\n" +
                "}\n" +
                "\n" +
                ".column-list {\n" +
                "\tdisplay: flex;\n" +
                "\tjustify-content: space-between;\n" +
                "}\n" +
                "\n" +
                ".column {\n" +
                "\tpadding: 0 1em;\n" +
                "}\n" +
                "\n" +
                ".column:first-child {\n" +
                "\tpadding-left: 0;\n" +
                "}\n" +
                "\n" +
                ".column:last-child {\n" +
                "\tpadding-right: 0;\n" +
                "}\n" +
                "\n" +
                ".table_of_contents-item {\n" +
                "\tdisplay: block;\n" +
                "\tfont-size: 0.875rem;\n" +
                "\tline-height: 1.3;\n" +
                "\tpadding: 0.125rem;\n" +
                "}\n" +
                "\n" +
                ".table_of_contents-indent-1 {\n" +
                "\tmargin-left: 1.5rem;\n" +
                "}\n" +
                "\n" +
                ".table_of_contents-indent-2 {\n" +
                "\tmargin-left: 3rem;\n" +
                "}\n" +
                "\n" +
                ".table_of_contents-indent-3 {\n" +
                "\tmargin-left: 4.5rem;\n" +
                "}\n" +
                "\n" +
                ".table_of_contents-link {\n" +
                "\ttext-decoration: none;\n" +
                "\topacity: 0.7;\n" +
                "\tborder-bottom: 1px solid rgba(55, 53, 47, 0.18);\n" +
                "}\n" +
                "\n" +
                "table,\n" +
                "th,\n" +
                "td {\n" +
                "\tborder: 1px solid rgba(55, 53, 47, 0.09);\n" +
                "\tborder-collapse: collapse;\n" +
                "}\n" +
                "\n" +
                "table {\n" +
                "\tborder-left: none;\n" +
                "\tborder-right: none;\n" +
                "}\n" +
                "\n" +
                "th,\n" +
                "td {\n" +
                "\tfont-weight: normal;\n" +
                "\tpadding: 0.25em 0.5em;\n" +
                "\tline-height: 1.5;\n" +
                "\tmin-height: 1.5em;\n" +
                "\ttext-align: left;\n" +
                "}\n" +
                "\n" +
                "th {\n" +
                "\tcolor: rgba(55, 53, 47, 0.6);\n" +
                "}\n" +
                "\n" +
                "ol,\n" +
                "ul {\n" +
                "\tmargin: 0;\n" +
                "\tmargin-block-start: 0.6em;\n" +
                "\tmargin-block-end: 0.6em;\n" +
                "}\n" +
                "\n" +
                "li > ol:first-child,\n" +
                "li > ul:first-child {\n" +
                "\tmargin-block-start: 0.6em;\n" +
                "}\n" +
                "\n" +
                "ul > li {\n" +
                "\tlist-style: disc;\n" +
                "}\n" +
                "\n" +
                "ul.to-do-list {\n" +
                "\ttext-indent: -1.7em;\n" +
                "}\n" +
                "\n" +
                "ul.to-do-list > li {\n" +
                "\tlist-style: none;\n" +
                "}\n" +
                "\n" +
                ".to-do-children-checked {\n" +
                "\ttext-decoration: line-through;\n" +
                "\topacity: 0.375;\n" +
                "}\n" +
                "\n" +
                "ul.toggle > li {\n" +
                "\tlist-style: none;\n" +
                "}\n" +
                "\n" +
                "ul {\n" +
                "\tpadding-inline-start: 1.7em;\n" +
                "}\n" +
                "\n" +
                "ul > li {\n" +
                "\tpadding-left: 0.1em;\n" +
                "}\n" +
                "\n" +
                "ol {\n" +
                "\tpadding-inline-start: 1.6em;\n" +
                "}\n" +
                "\n" +
                "ol > li {\n" +
                "\tpadding-left: 0.2em;\n" +
                "}\n" +
                "\n" +
                ".mono ol {\n" +
                "\tpadding-inline-start: 2em;\n" +
                "}\n" +
                "\n" +
                ".mono ol > li {\n" +
                "\ttext-indent: -0.4em;\n" +
                "}\n" +
                "\n" +
                ".toggle {\n" +
                "\tpadding-inline-start: 0em;\n" +
                "\tlist-style-type: none;\n" +
                "}\n" +
                "\n" +
                "/* Indent toggle children */\n" +
                ".toggle > li > details {\n" +
                "\tpadding-left: 1.7em;\n" +
                "}\n" +
                "\n" +
                ".toggle > li > details > summary {\n" +
                "\tmargin-left: -1.1em;\n" +
                "}\n" +
                "\n" +
                ".selected-value {\n" +
                "\tdisplay: inline-block;\n" +
                "\tpadding: 0 0.5em;\n" +
                "\tbackground: rgba(206, 205, 202, 0.5);\n" +
                "\tborder-radius: 3px;\n" +
                "\tmargin-right: 0.5em;\n" +
                "\tmargin-top: 0.3em;\n" +
                "\tmargin-bottom: 0.3em;\n" +
                "\twhite-space: nowrap;\n" +
                "}\n" +
                "\n" +
                ".collection-title {\n" +
                "\tdisplay: inline-block;\n" +
                "\tmargin-right: 1em;\n" +
                "}\n" +
                "\n" +
                ".simple-table {\n" +
                "\tmargin-top: 1em;\n" +
                "\tfont-size: 0.875rem;\n" +
                "}\n" +
                "\n" +
                ".simple-table-header {\n" +
                "\tbackground: rgb(247, 246, 243);\n" +
                "\tcolor: black;\n" +
                "\tfont-weight: 500;\n" +
                "}\n" +
                "\n" +
                "time {\n" +
                "\topacity: 0.5;\n" +
                "}\n" +
                "\n" +
                ".icon {\n" +
                "\tdisplay: inline-block;\n" +
                "\tmax-width: 1.2em;\n" +
                "\tmax-height: 1.2em;\n" +
                "\ttext-decoration: none;\n" +
                "\tvertical-align: text-bottom;\n" +
                "\tmargin-right: 0.5em;\n" +
                "}\n" +
                "\n" +
                "img.icon {\n" +
                "\tborder-radius: 3px;\n" +
                "}\n" +
                "\n" +
                ".user-icon {\n" +
                "\twidth: 1.5em;\n" +
                "\theight: 1.5em;\n" +
                "\tborder-radius: 100%;\n" +
                "\tmargin-right: 0.5rem;\n" +
                "}\n" +
                "\n" +
                ".user-icon-inner {\n" +
                "\tfont-size: 0.8em;\n" +
                "}\n" +
                "\n" +
                ".text-icon {\n" +
                "\tborder: 1px solid #000;\n" +
                "\ttext-align: center;\n" +
                "}\n" +
                "\n" +
                ".page-cover-image {\n" +
                "\tdisplay: block;\n" +
                "\tobject-fit: cover;\n" +
                "\twidth: 100%;\n" +
                "\theight: 30vh;\n" +
                "}\n" +
                "\n" +
                ".page-header-icon {\n" +
                "\tfont-size: 3rem;\n" +
                "\tmargin-bottom: 1rem;\n" +
                "}\n" +
                "\n" +
                ".page-header-icon-with-cover {\n" +
                "\tmargin-top: -0.72em;\n" +
                "\tmargin-left: 0.07em;\n" +
                "}\n" +
                "\n" +
                ".page-header-icon img {\n" +
                "\tborder-radius: 3px;\n" +
                "}\n" +
                "\n" +
                ".link-to-page {\n" +
                "\tmargin: 1em 0;\n" +
                "\tpadding: 0;\n" +
                "\tborder: none;\n" +
                "\tfont-weight: 500;\n" +
                "}\n" +
                "\n" +
                "p > .user {\n" +
                "\topacity: 0.5;\n" +
                "}\n" +
                "\n" +
                "td > .user,\n" +
                "td > time {\n" +
                "\twhite-space: nowrap;\n" +
                "}\n" +
                "\n" +
                "input[type=\"checkbox\"] {\n" +
                "\ttransform: scale(1.5);\n" +
                "\tmargin-right: 0.6em;\n" +
                "\tvertical-align: middle;\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "\tmargin-top: 0.5em;\n" +
                "\tmargin-bottom: 0.5em;\n" +
                "}\n" +
                "\n" +
                ".image {\n" +
                "\tborder: none;\n" +
                "\tmargin: 1.5em 0;\n" +
                "\tpadding: 0;\n" +
                "\tborder-radius: 0;\n" +
                "\ttext-align: center;\n" +
                "}\n" +
                "\n" +
                ".code,\n" +
                "code {\n" +
                "\tbackground: rgba(135, 131, 120, 0.15);\n" +
                "\tborder-radius: 3px;\n" +
                "\tpadding: 0.2em 0.4em;\n" +
                "\tborder-radius: 3px;\n" +
                "\tfont-size: 85%;\n" +
                "\ttab-size: 2;\n" +
                "}\n" +
                "\n" +
                "code {\n" +
                "\tcolor: #eb5757;\n" +
                "}\n" +
                "\n" +
                ".code {\n" +
                "\tpadding: 1.5em 1em;\n" +
                "}\n" +
                "\n" +
                ".code-wrap {\n" +
                "\twhite-space: pre-wrap;\n" +
                "\tword-break: break-all;\n" +
                "}\n" +
                "\n" +
                ".code > code {\n" +
                "\tbackground: none;\n" +
                "\tpadding: 0;\n" +
                "\tfont-size: 100%;\n" +
                "\tcolor: inherit;\n" +
                "}\n" +
                "\n" +
                "blockquote {\n" +
                "\tfont-size: 1.25em;\n" +
                "\tmargin: 1em 0;\n" +
                "\tpadding-left: 1em;\n" +
                "\tborder-left: 3px solid rgb(55, 53, 47);\n" +
                "}\n" +
                "\n" +
                ".bookmark {\n" +
                "\ttext-decoration: none;\n" +
                "\tmax-height: 8em;\n" +
                "\tpadding: 0;\n" +
                "\tdisplay: flex;\n" +
                "\twidth: 100%;\n" +
                "\talign-items: stretch;\n" +
                "}\n" +
                "\n" +
                ".bookmark-title {\n" +
                "\tfont-size: 0.85em;\n" +
                "\toverflow: hidden;\n" +
                "\ttext-overflow: ellipsis;\n" +
                "\theight: 1.75em;\n" +
                "\twhite-space: nowrap;\n" +
                "}\n" +
                "\n" +
                ".bookmark-text {\n" +
                "\tdisplay: flex;\n" +
                "\tflex-direction: column;\n" +
                "}\n" +
                "\n" +
                ".bookmark-info {\n" +
                "\tflex: 4 1 180px;\n" +
                "\tpadding: 12px 14px 14px;\n" +
                "\tdisplay: flex;\n" +
                "\tflex-direction: column;\n" +
                "\tjustify-content: space-between;\n" +
                "}\n" +
                "\n" +
                ".bookmark-image {\n" +
                "\twidth: 33%;\n" +
                "\tflex: 1 1 180px;\n" +
                "\tdisplay: block;\n" +
                "\tposition: relative;\n" +
                "\tobject-fit: cover;\n" +
                "\tborder-radius: 1px;\n" +
                "}\n" +
                "\n" +
                ".bookmark-description {\n" +
                "\tcolor: rgba(55, 53, 47, 0.6);\n" +
                "\tfont-size: 0.75em;\n" +
                "\toverflow: hidden;\n" +
                "\tmax-height: 4.5em;\n" +
                "\tword-break: break-word;\n" +
                "}\n" +
                "\n" +
                ".bookmark-href {\n" +
                "\tfont-size: 0.75em;\n" +
                "\tmargin-top: 0.25em;\n" +
                "}\n" +
                "\n" +
                ".sans { font-family: ui-sans-serif, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, \"Apple Color Emoji\", Arial, sans-serif, \"Segoe UI Emoji\", \"Segoe UI Symbol\"; }\n" +
                ".code { font-family: \"SFMono-Regular\", Menlo, Consolas, \"PT Mono\", \"Liberation Mono\", Courier, monospace; }\n" +
                ".serif { font-family: Lyon-Text, Georgia, ui-serif, serif; }\n" +
                ".mono { font-family: iawriter-mono, Nitti, Menlo, Courier, monospace; }\n" +
                ".pdf .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, \"Apple Color Emoji\", Arial, sans-serif, \"Segoe UI Emoji\", \"Segoe UI Symbol\", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK JP'; }\n" +
                ".pdf:lang(zh-CN) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, \"Apple Color Emoji\", Arial, sans-serif, \"Segoe UI Emoji\", \"Segoe UI Symbol\", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK SC'; }\n" +
                ".pdf:lang(zh-TW) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, \"Apple Color Emoji\", Arial, sans-serif, \"Segoe UI Emoji\", \"Segoe UI Symbol\", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK TC'; }\n" +
                ".pdf:lang(ko-KR) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, \"Apple Color Emoji\", Arial, sans-serif, \"Segoe UI Emoji\", \"Segoe UI Symbol\", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK KR'; }\n" +
                ".pdf .code { font-family: Source Code Pro, \"SFMono-Regular\", Menlo, Consolas, \"PT Mono\", \"Liberation Mono\", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }\n" +
                ".pdf:lang(zh-CN) .code { font-family: Source Code Pro, \"SFMono-Regular\", Menlo, Consolas, \"PT Mono\", \"Liberation Mono\", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }\n" +
                ".pdf:lang(zh-TW) .code { font-family: Source Code Pro, \"SFMono-Regular\", Menlo, Consolas, \"PT Mono\", \"Liberation Mono\", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }\n" +
                ".pdf:lang(ko-KR) .code { font-family: Source Code Pro, \"SFMono-Regular\", Menlo, Consolas, \"PT Mono\", \"Liberation Mono\", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }\n" +
                ".pdf .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK JP'; }\n" +
                ".pdf:lang(zh-CN) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK SC'; }\n" +
                ".pdf:lang(zh-TW) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK TC'; }\n" +
                ".pdf:lang(ko-KR) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK KR'; }\n" +
                ".pdf .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }\n" +
                ".pdf:lang(zh-CN) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }\n" +
                ".pdf:lang(zh-TW) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }\n" +
                ".pdf:lang(ko-KR) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }\n" +
                ".highlight-default {\n" +
                "\tcolor: rgba(55, 53, 47, 1);\n" +
                "}\n" +
                ".highlight-gray {\n" +
                "\tcolor: rgba(120, 119, 116, 1);\n" +
                "\tfill: rgba(145, 145, 142, 1);\n" +
                "}\n" +
                ".highlight-brown {\n" +
                "\tcolor: rgba(159, 107, 83, 1);\n" +
                "\tfill: rgba(187, 132, 108, 1);\n" +
                "}\n" +
                ".highlight-orange {\n" +
                "\tcolor: rgba(217, 115, 13, 1);\n" +
                "\tfill: rgba(215, 129, 58, 1);\n" +
                "}\n" +
                ".highlight-yellow {\n" +
                "\tcolor: rgba(203, 145, 47, 1);\n" +
                "\tfill: rgba(203, 148, 51, 1);\n" +
                "}\n" +
                ".highlight-teal {\n" +
                "\tcolor: rgba(68, 131, 97, 1);\n" +
                "\tfill: rgba(108, 155, 125, 1);\n" +
                "}\n" +
                ".highlight-blue {\n" +
                "\tcolor: rgba(51, 126, 169, 1);\n" +
                "\tfill: rgba(91, 151, 189, 1);\n" +
                "}\n" +
                ".highlight-purple {\n" +
                "\tcolor: rgba(144, 101, 176, 1);\n" +
                "\tfill: rgba(167, 130, 195, 1);\n" +
                "}\n" +
                ".highlight-pink {\n" +
                "\tcolor: rgba(193, 76, 138, 1);\n" +
                "\tfill: rgba(205, 116, 159, 1);\n" +
                "}\n" +
                ".highlight-red {\n" +
                "\tcolor: rgba(212, 76, 71, 1);\n" +
                "\tfill: rgba(225, 111, 100, 1);\n" +
                "}\n" +
                ".highlight-gray_background {\n" +
                "\tbackground: rgba(241, 241, 239, 1);\n" +
                "}\n" +
                ".highlight-brown_background {\n" +
                "\tbackground: rgba(244, 238, 238, 1);\n" +
                "}\n" +
                ".highlight-orange_background {\n" +
                "\tbackground: rgba(251, 236, 221, 1);\n" +
                "}\n" +
                ".highlight-yellow_background {\n" +
                "\tbackground: rgba(251, 243, 219, 1);\n" +
                "}\n" +
                ".highlight-teal_background {\n" +
                "\tbackground: rgba(237, 243, 236, 1);\n" +
                "}\n" +
                ".highlight-blue_background {\n" +
                "\tbackground: rgba(231, 243, 248, 1);\n" +
                "}\n" +
                ".highlight-purple_background {\n" +
                "\tbackground: rgba(244, 240, 247, 0.8);\n" +
                "}\n" +
                ".highlight-pink_background {\n" +
                "\tbackground: rgba(249, 238, 243, 0.8);\n" +
                "}\n" +
                ".highlight-red_background {\n" +
                "\tbackground: rgba(253, 235, 236, 1);\n" +
                "}\n" +
                ".block-color-default {\n" +
                "\tcolor: inherit;\n" +
                "\tfill: inherit;\n" +
                "}\n" +
                ".block-color-gray {\n" +
                "\tcolor: rgba(120, 119, 116, 1);\n" +
                "\tfill: rgba(145, 145, 142, 1);\n" +
                "}\n" +
                ".block-color-brown {\n" +
                "\tcolor: rgba(159, 107, 83, 1);\n" +
                "\tfill: rgba(187, 132, 108, 1);\n" +
                "}\n" +
                ".block-color-orange {\n" +
                "\tcolor: rgba(217, 115, 13, 1);\n" +
                "\tfill: rgba(215, 129, 58, 1);\n" +
                "}\n" +
                ".block-color-yellow {\n" +
                "\tcolor: rgba(203, 145, 47, 1);\n" +
                "\tfill: rgba(203, 148, 51, 1);\n" +
                "}\n" +
                ".block-color-teal {\n" +
                "\tcolor: rgba(68, 131, 97, 1);\n" +
                "\tfill: rgba(108, 155, 125, 1);\n" +
                "}\n" +
                ".block-color-blue {\n" +
                "\tcolor: rgba(51, 126, 169, 1);\n" +
                "\tfill: rgba(91, 151, 189, 1);\n" +
                "}\n" +
                ".block-color-purple {\n" +
                "\tcolor: rgba(144, 101, 176, 1);\n" +
                "\tfill: rgba(167, 130, 195, 1);\n" +
                "}\n" +
                ".block-color-pink {\n" +
                "\tcolor: rgba(193, 76, 138, 1);\n" +
                "\tfill: rgba(205, 116, 159, 1);\n" +
                "}\n" +
                ".block-color-red {\n" +
                "\tcolor: rgba(212, 76, 71, 1);\n" +
                "\tfill: rgba(225, 111, 100, 1);\n" +
                "}\n" +
                ".block-color-gray_background {\n" +
                "\tbackground: rgba(241, 241, 239, 1);\n" +
                "}\n" +
                ".block-color-brown_background {\n" +
                "\tbackground: rgba(244, 238, 238, 1);\n" +
                "}\n" +
                ".block-color-orange_background {\n" +
                "\tbackground: rgba(251, 236, 221, 1);\n" +
                "}\n" +
                ".block-color-yellow_background {\n" +
                "\tbackground: rgba(251, 243, 219, 1);\n" +
                "}\n" +
                ".block-color-teal_background {\n" +
                "\tbackground: rgba(237, 243, 236, 1);\n" +
                "}\n" +
                ".block-color-blue_background {\n" +
                "\tbackground: rgba(231, 243, 248, 1);\n" +
                "}\n" +
                ".block-color-purple_background {\n" +
                "\tbackground: rgba(244, 240, 247, 0.8);\n" +
                "}\n" +
                ".block-color-pink_background {\n" +
                "\tbackground: rgba(249, 238, 243, 0.8);\n" +
                "}\n" +
                ".block-color-red_background {\n" +
                "\tbackground: rgba(253, 235, 236, 1);\n" +
                "}\n" +
                ".select-value-color-pink { background-color: rgba(245, 224, 233, 1); }\n" +
                ".select-value-color-purple { background-color: rgba(232, 222, 238, 1); }\n" +
                ".select-value-color-green { background-color: rgba(219, 237, 219, 1); }\n" +
                ".select-value-color-gray { background-color: rgba(227, 226, 224, 1); }\n" +
                ".select-value-color-orange { background-color: rgba(250, 222, 201, 1); }\n" +
                ".select-value-color-brown { background-color: rgba(238, 224, 218, 1); }\n" +
                ".select-value-color-red { background-color: rgba(255, 226, 221, 1); }\n" +
                ".select-value-color-yellow { background-color: rgba(253, 236, 200, 1); }\n" +
                ".select-value-color-blue { background-color: rgba(211, 229, 239, 1); }\n" +
                "\n" +
                ".checkbox {\n" +
                "\tdisplay: inline-flex;\n" +
                "\tvertical-align: text-bottom;\n" +
                "\twidth: 16;\n" +
                "\theight: 16;\n" +
                "\tbackground-size: 16px;\n" +
                "\tmargin-left: 2px;\n" +
                "\tmargin-right: 5px;\n" +
                "}\n" +
                "\n" +
                ".checkbox-on {\n" +
                "\tbackground-image: url(\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20width%3D%2216%22%20height%3D%2216%22%20fill%3D%22%2358A9D7%22%2F%3E%0A%3Cpath%20d%3D%22M6.71429%2012.2852L14%204.9995L12.7143%203.71436L6.71429%209.71378L3.28571%206.2831L2%207.57092L6.71429%2012.2852Z%22%20fill%3D%22white%22%2F%3E%0A%3C%2Fsvg%3E\");\n" +
                "}\n" +
                "\n" +
                ".checkbox-off {\n" +
                "\tbackground-image: url(\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20x%3D%220.75%22%20y%3D%220.75%22%20width%3D%2214.5%22%20height%3D%2214.5%22%20fill%3D%22white%22%20stroke%3D%22%2336352F%22%20stroke-width%3D%221.5%22%2F%3E%0A%3C%2Fsvg%3E\");\n" +
                "}\n" +
                "\t\n" +
                "</style></head><body><article id=\"fbe1e903-d9ad-4cc9-822d-132cd24bf4b1\" class=\"page sans\"><header><h1 class=\"page-title\">API PRODUTO - TRABALHO WEBSEGUROS</h1></header><div class=\"page-body\"><h1 id=\"b04736a1-b832-4e4c-afd4-1c45090aef0c\" class=\"\"><mark class=\"highlight-blue_background\">Alunos</mark></h1><ul id=\"25378a36-54f4-4287-864d-017508866cac\" class=\"bulleted-list\"><li style=\"list-style-type:disc\">Abner Matheus</li></ul><ul id=\"03d2066e-bb20-4d95-b0c2-71761efeaf09\" class=\"bulleted-list\"><li style=\"list-style-type:disc\">Charles Jamil</li></ul><ul id=\"d150775f-2eff-46be-8877-d5bc44b310e1\" class=\"bulleted-list\"><li style=\"list-style-type:disc\">Jhonatan Medeiros</li></ul><ul id=\"0ad28419-69be-4ec0-8adf-57b24a999786\" class=\"bulleted-list\"><li style=\"list-style-type:disc\">Matheus Gomes</li></ul><ul id=\"9bd27e2b-9f9b-4eec-958d-7a63426d3219\" class=\"bulleted-list\"><li style=\"list-style-type:disc\">Osvaldo Cabral</li></ul><p id=\"9241c768-0411-4345-b98f-765ac5ccb49b\" class=\"\">\n" +
                "</p></div></article></body></html>";
        return ResponseEntity.ok().body(html);
    }

}
