<html>
    <head>
    <meta charset= "utf-8">
 <link rel="icon" href="favicon.ico">

    <title>RSS Feeds</title>
    </head>

    <body>
    <?php

    $html = "";
    $publisher = "NASA";
    $url = "https://www.nasa.gov/rss/dyn/educationnews.rss";

    $html .= '<h2>' .$publisher . '</h2>';
    $html .= $url;
    

    $rss = simplexml_load_file($url);
    $count = 0;
    $html .= '<ul>';

    foreach($rss->channel->item as $item) {
        $count++;
        if ($count > 10) {
        break;
        }

        $html .= '<li><a href="'.htmlspecialchars($item->link).'">'. htmlspecialchars($item->title) . '</a><br />';
        $html .= htmlspecialchars($item->description) . '<br />';
        $html .= htmlspecialchars($item->pubDate) . '</li><br />';
    }
    $html .='</ul>';

    print $html;
    ?>
    </body>
    </html>